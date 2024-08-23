package com.training.quest2;

public class RarExtractor implements Extractor {

	@Override
	public void extractFiles(String... filenames) {
		System.out.println("Extracting from Rar");
		for(String files :filenames)
		{
			System.out.println(files);
		}

	}

}
