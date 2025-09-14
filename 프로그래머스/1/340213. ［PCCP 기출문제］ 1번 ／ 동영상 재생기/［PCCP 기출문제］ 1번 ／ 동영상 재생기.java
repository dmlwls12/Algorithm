class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        String[] vParts = video_len.split(":");
        int videoLength = Integer.parseInt(vParts[0]) * 60 + Integer.parseInt(vParts[1]);
        
        String[] pParts = pos.split(":");
        int position = Integer.parseInt(pParts[0]) * 60 + Integer.parseInt(pParts[1]);
        
        String[] sParts = op_start.split(":");
        int opStart = Integer.parseInt(sParts[0]) * 60 + Integer.parseInt(sParts[1]);
        
        String[] eParts = op_end.split(":");
        int opEnd = Integer.parseInt(eParts[0]) * 60 + Integer.parseInt(eParts[1]);
        
        for(String cmd : commands){
            
            if(opStart <= position && position <= opEnd){
                position = opEnd;
            }
            
            if(cmd.equals("prev")){
                position = Math.max(0, position - 10);
            } else if(cmd.equals("next")){
                position = Math.min(videoLength, position + 10);
            }
        }
        
        if(opStart <= position && position <= opEnd){
                position = opEnd;
        }
        
        int mm = position / 60;
        int ss = position % 60;
        return String.format("%02d:%02d", mm, ss);
    }
}