package com.github.chaoswang.learning.java.jvm.method;

import com.github.chaoswang.learning.java.jvm.attr.CodeAttr;
import com.github.chaoswang.learning.java.jvm.clz.ClassFile;
import com.github.chaoswang.learning.java.jvm.loader.ByteCodeIterator;

public class Method {
	private int accessFlag;
	private int nameIndex;
	private int descriptorIndex;
	
	private CodeAttr codeAttr;
	
	private ClassFile clzFile;
	
	
	public ClassFile getClzFile() {
		return clzFile;
	}

	public int getNameIndex() {
		return nameIndex;
	}
	public int getDescriptorIndex() {
		return descriptorIndex;
	}
	
	public CodeAttr getCodeAttr() {
		return codeAttr;
	}

	public void setCodeAttr(CodeAttr code) {
		this.codeAttr = code;
	}

	public Method(ClassFile clzFile,int accessFlag, int nameIndex, int descriptorIndex) {
		this.clzFile = clzFile;
		this.accessFlag = accessFlag;
		this.nameIndex = nameIndex;
		this.descriptorIndex = descriptorIndex;
	}

	
	
	
	
	public static Method parse(ClassFile clzFile, ByteCodeIterator iter){
		return null;
		
	}
}
