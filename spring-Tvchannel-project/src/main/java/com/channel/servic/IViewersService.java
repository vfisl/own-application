package com.channel.servic;

import java.nio.channels.Channel;
import java.util.List;


import com.channel.model.Viewers;

public interface IViewersService {
	Viewers  addViewers (Viewers  viewers );
	  void updateViewers (Viewers  viewers );
	  void deleteTelevision(Viewers  viewerId);
	   Channel getViewersById(int viewersId);
	   List<Viewers > viewersList();
	   List<Viewers >getAll();


}
