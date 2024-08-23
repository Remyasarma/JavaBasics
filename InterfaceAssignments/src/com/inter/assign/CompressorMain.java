package com.inter.assign;

public class CompressorMain {

	public static void main(String[] args) {
		FileCompressor filecompressor = new ZipCompressor();
		filecompressor.compressFile();
		filecompressor = new JarCompressor();
		filecompressor.compressFile();
		filecompressor= new RarCompressor();
		filecompressor.compressFile();

	}

}
