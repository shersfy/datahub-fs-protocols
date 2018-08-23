package org.shersfy.datahub.fs.protocols;

import org.apache.hadoop.hdfs.DFSInputStream;

public interface FileUploadService extends RpcProtocol{
    
    String write(DFSInputStream input);

}
