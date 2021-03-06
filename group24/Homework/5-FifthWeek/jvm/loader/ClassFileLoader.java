package com.coderising.jvm.loader;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import com.coderising.jvm.clz.ClassFile;





public class ClassFileLoader {

	private List<String> clzPaths = new ArrayList<String>();
	
	public byte[] readBinaryCode(String className) {
		
		className = className.replace('.', File.separatorChar) +".class";
		
		for(String path : this.clzPaths){
			
			String clzFileName = path + File.separatorChar + className;
			byte[] codes = loadClassFile(clzFileName);
			if(codes != null){
				return codes;
			}			
		}
		
		return null;
		
		
		
	}
	
	public void addClassPath(String path) {
		if(this.clzPaths.contains(path)){
			return;
		}
		
		this.clzPaths.add(path);
		
	}
	
	
	public String getClassPath(){
		return StringUtils.join(this.clzPaths,";");
	}

	public ClassFile loadClass(String className) {
		
		return null;
	}

}