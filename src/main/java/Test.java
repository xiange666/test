import org.apache.log4j.Logger;

public class Test {
	public static Logger lo=Logger.getLogger(Test.class);
	public static void main(String[] args) {
        try {
            int result=5/0;//出现异常
        } catch (Exception e) {
            System.out.println("除数不能为零！");
            lo.info("除数不能为0");//保存日志
            lo.error("这是严重错误");
            lo.warn("这是警告错误");
            lo.info("这是一般信息提示");
            lo.debug("这是调试信息");
        }
  
    }

}
