package com.java.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取和修改文件最后的修改日期 
 * 使用 File 类的 File.lastModified() 获取文件修改时间 
 *	File setLastModified() 方法来修改文件最后的修改日期
 */
public class LastModified {
	public static void main(String[] args) {

		File file = new File("d:/test.txt");

		String str = "YYYY-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(str);// 时间格式转换

		System.out.println(sdf.format(file.lastModified()));// 获取文件最后修改日期

		// 修改文件最后日期
		System.out.println(file.setLastModified(System.currentTimeMillis()));// 打印是否进行修改，修改返回true，否则返回false
		// Date date=new Date(file.lastModified());

		System.out.println("修改后的日期：" + sdf.format(file.lastModified()));// 获取文件最后修改日期

	}

}
