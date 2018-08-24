package org.shersfy.datahub.fs.protocols;

import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

public interface StandardService extends RPCProtocol{
    
    /**
     * 初始化连接客户端，清除历史连接资源
     * @param clientId 客户端Id
     */
    void initClient(Text clientId);

    /**
     * 创建FileSystem连接
     * @param clientId 客户端ID
     * @param resId 连接资源ID
     * @return 返回连接key
     */
    Text fsConnect(Text clientId, LongWritable resId);

    /**
     * 创建文件，获得输出流
     * @param key 连接key
     * @param path 文件路径
     * @return true成功，false失败
     */
    BooleanWritable fsCreateNewFile(Text key, Text path);

    /**
     * 获得追加输出流
     * @param key 连接key
     * @param path 文件路径
     * @return true成功，false失败
     */
    BooleanWritable fsAppend(Text key, Text path);

    /**
     * 打开输入流
     * @param key 连接key
     * @param path 文件路径
     * @return true成功，false失败
     */
    BooleanWritable fsOpen(Text key, Text path);

    /**
     * 写入字节数据到输出流
     * @param key 连接key
     * @param bytes 数据
     */
    void fsWrite(Text key, BytesWritable bytes);

    /**
     * 从输入流读取数据
     * @param key 连接key
     * @param bytes 数据容器
     * @return
     */
    IntWritable fsRead(Text key, BytesWritable bytes);

    /**
     * 关闭输入流和输出流
     * @param key 连接key
     */
    void fsClose(Text key);

}
