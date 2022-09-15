package com.wonderrobot.sfhanbaizaikokanrishisutemu.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import java.io.File;
import com.wonderfulfly.common.InOutPrintBean;
import org.springframework.stereotype.Component;


@Component
public class OutPutDataConstant {
	public boolean createDirs(String dirs) throws Exception {
		if (!StringUtil.isNullOrBlank(dirs)) {
		File file = new File(dirs);
			if (file.mkdirs()) {
				return true;
			} else {
				file = null;
			}
		}
		return false;
	}
	private Map<String, String> setFileMap () throws Exception {
		HashMap<String, String> fileMap = new HashMap<String, String>();
		return fileMap;
	}
	public String getFileIDByAttachID(String attachID) throws Exception {
		Map<String, String> fileMap = setFileMap();
		return fileMap.get(attachID);
	}
}
