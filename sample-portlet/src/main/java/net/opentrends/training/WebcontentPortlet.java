package net.opentrends.training;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
import com.liferay.portlet.dynamicdatamapping.service.DDMStructureLocalServiceUtil;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import net.opentrends.training.constants.JsonConstants;

/**
 * Portlet implementation class WebcontentPortlet
 */
public class WebcontentPortlet extends MVCPortlet {
 
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException
			 {
	
		 javax.portlet.PortletPreferences preferences = renderRequest.getPreferences();
		String StructureName = preferences.getValue("structureName", StringPool.BLANK);
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		System.out.println("StructureName in controller : -"+StructureName);
		
		String ddmStructureKey = null;
		long groupId = themeDisplay.getScopeGroupId();
		String languageId = themeDisplay.getLanguageId();
		ddmStructureKey = getDDmStructureId(StructureName, groupId, languageId);
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		JSONObject results = JSONFactoryUtil.createJSONObject();
		JSONArray resultsArray = JSONFactoryUtil.createJSONArray();

			String textField = StringPool.BLANK;
			String descriptionField = StringPool.BLANK;
			
			try {
				List<JournalArticle> journalArticleList = JournalArticleLocalServiceUtil.getStructureArticles(groupId, ddmStructureKey);

				  for(JournalArticle article : journalArticleList){
					  try {
						  if(JournalArticleLocalServiceUtil.isLatestVersion(groupId, article.getArticleId(), article.getVersion())) {
							  //System.out.println("article by : "+article);
							//  String content = article.getContentByLocale(languageId);
							  com.liferay.portal.kernel.xml.Document document = null;
							  document = SAXReaderUtil.read(new StringReader(article.getContent()));
							  List<Node> textNode = document.selectNodes("/root/dynamic-element[@name=\"text\"]/dynamic-content");
							     for (Node text : textNode) {
							    	  textField = text.getText();
							    	  jsonObject.put(JsonConstants.TEXT, textField);
							     }
							     List<Node> descriptionNode = document.selectNodes("/root/dynamic-element[@name=\"description\"]/dynamic-content");
							     for (Node description : descriptionNode) {
							    	  descriptionField = description.getText();
							    	  jsonObject.put(JsonConstants.DESCRIPTION, descriptionField);
							     }  
						  }
						 
						 resultsArray.put(jsonObject);
					    System.out.println("resultsArray inside try--------------> "+resultsArray);
						
				  } catch (Exception e) {
					// TODO: handle exception
				}
					  }
				     resultsArray.put(jsonObject);
			    	 System.out.println("resultsArray outside for--------------> "+resultsArray);
				      
			} catch (Exception e) {
				// TODO: handle exception
			}
			
	super.doView(renderRequest, renderResponse); 
	}
	
	public JSONArray getContentDetails(ActionRequest actionRequest, ActionResponse actionResponse, ThemeDisplay themeDisplay) {
		javax.portlet.PortletPreferences preferences = actionRequest.getPreferences();
		String StructureName = preferences.getValue("structureName", StringPool.BLANK);

		String textField = StringPool.BLANK;
		String descriptionField = StringPool.BLANK;
		
		List<JournalArticle> journalArticleList = JournalArticleLocalServiceUtil.getStructureArticles(groupId, ddmStructureKey);
		
		return null;	
	}

	private String getDDmStructureId(String structureName, long groupId, String languageId) {
		String ddmStructureKey = null;
		try {
			List<DDMStructure> structureList = DDMStructureLocalServiceUtil.getStructures(groupId);
			 for(DDMStructure ddmStructure : structureList) {
				 if(ddmStructure.getName(languageId).equalsIgnoreCase(structureName)) {
					 System.out.println("ddmStructure "+ddmStructure);
					 ddmStructureKey =ddmStructure.getStructureKey();
				 }
			 }
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ddmStructureKey;
	}
}
