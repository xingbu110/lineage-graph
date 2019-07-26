## 项目介绍
### 项目模块介绍

* lineage-common
    * lineage-entity
         * 实体对象模块,定义图节点的类型 
    * lineage-parser-base
         * 解析模块的公共父模块
    * lineage-spi
         * 公共接口定义模块
* lineage-parser
    * lineage-parser-hive
        * hive sql解析模块
* lineage-service （待定）
    * web服务模块,监听 以及读取文件 以及restApi和web服务
* lineage-storage
    * lineage-neo4j
        * 与neo4j进行交互的模块 