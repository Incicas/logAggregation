package com.armory.logsort;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class LogPrinter {

    public void printLogs(List<File> logFiles) {
        sortLogs(logFiles).forEach(logLine -> System.out.println(logLine));
    }


//    class Solution {
//        public List<String> mergeKLists(List<File> logFiles) throws IOException {
//            PriorityQueue<String> logLines = new PriorityQueue();
//            for(File file : logFiles){
//                while(file != null){
//                    logLines.addAll(Files.readAllLines(file.toPath()));
//                    file = file.getNext();
//                }
//            }
//            ListNode temp=new ListNode("-1");
//            ListNode head=temp;
//            while(!logLines.isEmpty()){
//                head.setNext(new ListNode(logLines.remove()));
//                head= head.getNext();
//            }
//            return temp.getNext();
//        }
//    }
    protected List<String> sortLogs(List<File> logFiles) {
        List<String> logLines = new ArrayList<>();
        try {
            for (File file : logFiles) {
                logLines.addAll(Files.readAllLines(file.toPath()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(logLines);
        return logLines;
    }

}
