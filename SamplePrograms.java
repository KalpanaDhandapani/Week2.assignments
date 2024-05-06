package com.week2.assignments;

public class SamplePrograms {

	public static void main(String[] args) {
		
		//basic relative xpath locators - 5
		
		//tagName[@attributeName='attributevalue'] -- attribute based xpath
		//tagName[text(),'textvalue'] -- text based xpath
		//tagName[contains(@attributeName,'partialattributevalue')] -- partial match attribute based xpath
		//tagName[contains(text(),'partialtextvalue')] -- partial match text based xpath
//		(//tagName[@attributeName='attributevalue'])[index] -- index based xpath

			
		
		// advanced xpath locators - 8
		
		// parent to child
		// parent relative xpath/childTagName
		
		// grandparent to grandchild
		// grandparent relative xpath//grandchildTagName
		
		// child to parent
		// child relative xpath/parent::parentTagName
		
		// grandchild to grandparent
		// grandchild relative xpath/ancestor::grandparentTagName
		
		// elder sibling to younger sibling
		// elderSibling relative xpath/following-sibling::youngerSiblingTagName
		
		// younger sibling to elder sibling
		// youngerSibling relative xpath/preceding-sibling::elderSiblingTagName
		
		// elder cousin to younger cousin
		// elderCousin relative xpath/following::youngerCousinTagName
		
		// younger cousin to elder cousin
		// youngerCousin relative xpath/preceding::elderCousinTagName
		
		
		
	}

}
