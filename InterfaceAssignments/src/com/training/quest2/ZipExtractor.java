package com.training.quest2;

public class ZipExtractor implements Extractor {

	@Override
	public void extractFiles(String... filenames) {
		System.out.println("Extracting from Zip");
		for(String files :filenames)
		{
			System.out.println(files);
		}


	}

}
