package com.cheung.shadowsocks.model;

import com.cheung.shadowsocks.encryption.ICrypt;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.socks.SocksAddressType;
import lombok.Data;

import java.util.List;

/**
 * Created by cheungrp on 18/7/3.
 */
@Data
public class SSModel {

    private ChannelHandlerContext channelHandlerContext;
    private String tsn;
    private ICrypt crypt;
    private List<byte[]> data;
    private byte[] cacheData;
    private SocksAddressType hostType;
    private String host;
    private int port;
}
