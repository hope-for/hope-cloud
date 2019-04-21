# <a href="https://github.com/java-aodeng/hope-cloud">HOPE-CLOUD</a>

## clode-config使用说明：

提供配置文件的存储、以接口的形式将配置文件的内容提供出去

仓库中的配置文件会被转换成web接口，访问可以参照以下的规则：

/{application}/{profile}[/{label}]

/{application}-{profile}.yml

/{label}/{application}-{profile}.yml

/{application}-{profile}.properties

/{label}/{application}-{profile}.properties

以hope-config-dev.properties为例子，它的application是hope-config，profile是dev。client会根据填写的参数来选择读取对应的配置。

:访问 http://服务地址:8001/hope-config/dev  就会返回这个配置文件的json数据

## 关于：

* [author：低调小熊猫](https://aodeng.cc)
* [项目开源地址：https://github.com/java-aodeng/hope-cloud](https://github.com/java-aodeng/hope-cloud)

## 传送门：

[博客](https://aodeng.cc)
[微信公众号(低调小熊猫)](https://mp.weixin.qq.com/s/l5t8WSCG_-shiD4BPpLYiw) 
[GPL-v3.0协议开源](https://github.com/java-aodeng/hope/blob/master/LICENSE)
[低调小熊猫QQ群](https://jq.qq.com/?_wv=1027&k=5y4H7Nz) 
[低调小熊猫Telegram群](https://t.me/joinchat/LSsyBxVKLGEkF5MtIhg6TQ)
[Gitee链接](https://gitee.com/java-aodeng/hope)
[Github链接](https://github.com/java-aodeng/hope)
[另一个开源项目](https://github.com/java-aodeng/hope)
