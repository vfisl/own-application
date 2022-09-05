package com.channel.servic;

import java.nio.channels.Channel;
import java.util.List;



public interface IChannelService {
  List<Channel>  addChannel(Channel channel);
  List<Channel> updateChannel(Channel channel);
  Channel deleteChannel(Channel channelId);
   Channel getByChannelId(int channelId);
   List<Channel> channelList();
   List<Channel>getAll();
   
}
