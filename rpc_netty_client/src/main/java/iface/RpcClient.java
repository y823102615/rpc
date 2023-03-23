package iface;

import vo.RpcRequest;

public interface RpcClient {
    Object sendRequest(RpcRequest rpcRequest);
}
