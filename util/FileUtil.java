package yvan.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	/**
	 *	计算文件/文件夹个数
	 *	@param path 目标路径
	 *
	 */
	private static int filecounts = 0;	//文件个数
	private static int dirscounts = 0;	//文件夹个数
	
	public static int countFiles(String path){
		File file = new File(path);
		File[] nodelist = file.listFiles();
		for (int i = 0; i < nodelist.length; i++) {
			if(nodelist[i] != null && nodelist[i].isFile()){
				filecounts++;
			}else {
				countFiles(nodelist[i].getPath());
			}
		}
		return filecounts;
	}
	
	public static int countDirs(String path){
		File file = new File(path);
		File[] nodelist = file.listFiles();
		for (int i = 0; i < nodelist.length; i++) {
			if(nodelist[i] != null && nodelist[i].isDirectory()){
				dirscounts++;
				countDirs(nodelist[i].getPath());
			}
		}
		return dirscounts;
	}
	
	/**
	 *	遍历文件名path
	 *	@param path 目标路径
	 *
	 */
	private static List<String> list = new ArrayList<String>();
	public static List<String> allFiles(String path){
		File file = new File(path);
		File[] nodelist = file.listFiles();
		for (int i = 0; i < nodelist.length; i++) {
			if(nodelist[i] != null && nodelist[i].isFile()){
				list.add(nodelist[i].getPath());
			}else {
				allFiles(nodelist[i].getPath());
			}
		}		
		return list;
	}

}
