package yewer.singleton;
import org.junit.Test;

public class LoadBalancerTest {
    @Test
    public void test01() {
        LoadBalancer balancer01, balancer02, balancer03, balancer04;
        balancer01 = LoadBalancer.getLoadBalancer();
        balancer02 = LoadBalancer.getLoadBalancer();
        balancer03 = LoadBalancer.getLoadBalancer();
        balancer04 = LoadBalancer.getLoadBalancer();

        if (balancer01 == balancer02 && balancer02 == balancer03 && balancer03 == balancer04) {
            System.out.println("服务器负载均衡具有唯一性");
        }

        balancer01.addServer("server 1");
        balancer01.addServer("server 2");
        balancer02.addServer("server 3");
        balancer04.addServer("server 4");

        for (int i = 0; i < 10; i++) {
            String server = balancer01.getServer();
            System.out.println("分发到 "+server);
        }



    }
}