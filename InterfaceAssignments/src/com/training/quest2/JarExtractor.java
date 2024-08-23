package com.training.quest2;

public class JarExtractor implements Extractor {

	@Override
	public void extractFiles(String... filenames) {
		System.out.println("Extracting from Jar");
		for(String files :filenames)
		{
			System.out.println(files);
		}

	}

}
