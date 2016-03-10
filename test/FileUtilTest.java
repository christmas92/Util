package fayuan;

import java.util.List;

import yvan.util.FileUtil;

public class FileUtilTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "targetpath";
		System.out.println("文件个数："+FileUtil.countFiles(path));
		System.out.println("文件夹个数："+FileUtil.countDirs(path));
		
		List<String> list = FileUtil.allFiles(path);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("文件路径" + list.get(i));
		}
	}
}
