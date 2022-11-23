import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class app
{

    public static void main(String []args)
    {

        ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newCachedThreadPool();
        executor.submit(()->{ System.out.println("Salam"); });
        executor.submit(()->{ System.out.println("hello"); });

    }

}
