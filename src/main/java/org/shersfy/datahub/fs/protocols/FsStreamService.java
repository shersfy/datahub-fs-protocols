package org.shersfy.datahub.fs.protocols;

import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

public interface FsStreamService extends RPCProtocol{
    
    BooleanWritable connect(Text fsMeta);
    
    BooleanWritable createNewFile(Text path);
    
    BooleanWritable append(Text path);
    
    BooleanWritable open(Text path);
    
    void write(BytesWritable bytes);
    
    IntWritable read(BytesWritable bytes);
    
    void closeInputStream();
    
    void closeOutputStream();
    
}
