
Ext.define('Ext.ux.calendar.CalendarContainer', {
	extend : 'Ext.Panel',
	initComponent : function() {
		var eh = this.ehandler;
		var cs = eh.calendarSetting;
		var lan = Ext.ux.calendar.Mask.CalendarContainer;
		var now = new Date();
		this.startDate = now;
		this.endDate = now;
		if (undefined == cs.initialView|| false == Ext.ux.calendar.Mask.typeOf(cs.initialView)) {
			this.currentIdx = 1;
		} else {
			this.currentIdx = parseInt(cs.initialView);
		}
		
		this.dayView=Ext.create('Ext.ux.calendar.view.DayView',{
					border : false,
					dayFormat : cs.dayFormat,
					offsetPercent : 0.05,
					shiftDay : 1,
					dayNum : 1,
					startColIndex : 0,
					endColIndex : 1,
					ehandler : this.ehandler
				});

	    this.weekView=Ext.create('Ext.ux.calendar.view.DayView',{
					border : false,
					dayFormat : cs.weekFormat,
					offsetPercent : 0.1,
					shiftDay : 7,
					dayNum : 7,
					startColIndex : 0,
					endColIndex : 7,
					ehandler : this.ehandler
				});
		
		this.dayView=Ext.create('Ext.ux.calendar.view.DayView',{
					border : false,
					dayFormat : cs.dayFormat,
					offsetPercent : 0.05,
					shiftDay : 1,
					dayNum : 1,
					startColIndex : 0,
					endColIndex : 1,
					ehandler : this.ehandler
				});

	   this.weekOnlyView=Ext.create('Ext.ux.calendar.view.DayView',{
					border : false,
					dayFormat : cs.weekFormat,
					offsetPercent : 0.1,
					dayNum : 5,
					shiftDay : 7,
					startColIndex : 0,
					endColIndex : 5,
					ehandler : this.ehandler
				});
				
  this.monthView=Ext.create('Ext.ux.calendar.view.MonthView',{
					border : false,
					dayFormat : cs.monthFormat,
					dayNum : 7,
					shiftDay : 7,
					startColIndex : 0,
					endColIndex : 7,
					ehandler : this.ehandler
				});
	this.resultView=Ext.create('Ext.ux.calendar.view.ResultView',{
					border : false,
					ehandler : this.ehandler
				});

	this.detailEditor=Ext.create('Ext.ux.calendar.editor.DetailEditor',{
					ehandler : this.ehandler
				});
   this.backBtn=Ext.create('Ext.button.Button',{
					iconCls : 'icon_feyaCalendar_back',
					handler : this.onBackFn,
					scope : this
				});

	this.nextBtn=Ext.create('Ext.button.Button',{
					iconCls : 'icon_feyaCalendar_next',
					handler : this.onNextFn,
					scope : this
				});
	this.todayBtn=Ext.create('Ext.button.Button',{
					text : lan['todayBtn.text'],
					iconCls : 'icon_feyaCalendar_today',
					handler : this.onTodayFn,
					scope : this
				});
	this.refreshBtn=Ext.create('Ext.button.Button',{
					iconCls : 'x-tbar-loading',
					handler : this.onRefreshFn,
					scope : this
				});
	this.dayBtn =Ext.create('Ext.button.Button',{
					iconCls : 'icon_feyaCalendar_dayview',
					pressed : 0 == this.currentIdx,
					text : lan['dayBtn.text'],
					handler : this.onDayFn,
					scope : this
				});

	 this.dayBtn =Ext.create('Ext.button.Button',{
					iconCls : 'icon_feyaCalendar_dayview',
					pressed : 0 == this.currentIdx,
					text : lan['dayBtn.text'],
					handler : this.onDayFn,
					scope : this
				});
		
	  this.weekMenu =Ext.widget('menu',{
					items : [{
								text : lan['weekMenu.showAll.text'],
								checked : true,
								group : 'week',
								handler : this.onWeekAllFn,
								scope : this
							}, {
								text : lan['weekMenu.onlyWeek.text'],
								checked : false,
								group : 'week',
								handler : this.onWeekOnlyFn,
								scope : this
							}]
				})
        this.weekBtn=Ext.widget('splitbutton',{
					iconCls : 'icon_feyaCalendar_weekview',
					text : lan['weekBtn.text'],
					pressed : 1 == this.currentIdx,
					arrowAlign : 'right',
					menu : this.weekMenu,
					handler : this.onWeekFn,
					scope : this
				})
		 this.monthMenu =Ext.widget('menu',{
					items : [{
								text : lan['monthMenu.showAll.text'],
								checked : true,
								group : 'month',
								handler : this.onMonthAllFn,
								scope : this
							}, {
								text : lan['monthMenu.onlyWeek.text'],
								checked : false,
								group : 'month',
								handler : this.onMonthOnlyFn,
								scope : this
							}]
				})
       this.monthBtn=Ext.widget('splitbutton',{
					iconCls : 'icon_feyaCalendar_monthview',
					text : lan['monthBtn.text'],
					pressed : 2 == this.currentIdx,
					arrowAlign : 'right',
					menu : this.monthMenu,
					handler : this.onMonthFn,
					scope : this
				})
		var items = [];
		/*
		 * below code is for language submenu, you can set SHOW_LANGUAGE_MENU to false if you don't need it
		 */
		if (Ext.ux.calendar.CONST.SHOW_LANGUAGE_MENU) {
			var data = Ext.ux.calendar.Mask.getLanguageConfig().data;
			for (var i = 0, len = data.length; i < len; i++) {
				var d = data[i];
				items.push( {
					group : 'language',
					checked : d[0] == cs.language,
					text : d[1],
					name : d[0],
					handler : this.onLanguageSettingFn,
					scope : this
				});
			}
			var lanMenu=Ext.create('Ext.menu.Menu',{
	        	minWidth: 150,
	            items:items
             })
            items = [];
			items.push({
						iconCls : 'icon_feyacalendar_world',
						text : lan['moreMenu.language.text'],
						menu :lanMenu,
						scope : this
					});
		}
	
		items.push({
					iconCls : 'icon_feyaCalendar_setting',
					text : lan['moreMenu.setting.text'],
					handler : this.onSettingFn,
					scope : this
				});
		items.push({
					iconCls : 'icon_feyaCalendar_clock',
					text : lan['moreMenu.showAlert.text'],
					handler : this.onShowAlertFn,
					scope : this
				});
		items.push({
					iconCls : 'icon-cubedrive',
					text : lan['moreMenu.about.text'],
					handler : this.onAboutMyCalendarFn,
					scope : this
				});
	  this.moreMenu =Ext.create('Ext.menu.Menu',{
					minWidth : 200,
					items : items
				})

		this.moreBtn =Ext.create('Ext.Button',{
					iconCls : 'icon_feyaCalendar_setting',
					text : lan['moreBtn.text'],
					menu : this.moreMenu
				})
       this.searchField =Ext.create('Ext.ux.form.SearchField',{
					width : 250,
					onTrigger1Click : Ext.bind(this.cancelSearchFn, this),
					onTrigger2Click : Ext.bind(this.onSearchFn, this)
				})
		items = [this.dayView, this.weekView, this.monthView, this.resultView,this.weekOnlyView, this.detailEditor];
				
		this.currentView = items[this.currentIdx];
		Ext.apply(this, {
					border : false,
					region : 'right',
					cls : 'x-calendar-container',
					layout : {
						type : 'card',
						deferredRender : true
					},
					bodyStyle : 'border-top:none;background:none;',
					activeItem : this.currentIdx,
					items : items,
					tbar : Ext.create('Ext.toolbar.Toolbar',{
								items : [this.backBtn, this.nextBtn, this.todayBtn, '-',
										lan['searchCriteria.text'], this.searchField, '->',
										this.refreshBtn, '-', this.dayBtn, '-',
										this.weekBtn, '-', this.monthBtn, '-', this.moreBtn]
							})
				});

		this.addEvents('refresh', 'editcalendar');
		var options = {
			single : true
		};
		if (Ext.isIE) {
			options['delay'] = 500;
		}
		this.currentView.on('afterresize', this.onAfterResizeFn, this, options);
		this.weekView.on('viewDay', this.onDayChangeFn, this);
		this.weekOnlyView.on('viewDay', this.onDayChangeFn, this);
		this.monthView.on('viewDay', this.onDayChangeFn, this);
		this.monthView.on('viewWeek', this.onWeekChangeFn, this);
		this.dayView.on('viewWeek', this.onWeekChangeFn, this);
		this.relayEvents(this.dayView, ['beforeremoteload', 'remoteload','hideeditor']);
		this.relayEvents(this.weekView, ['beforeremoteload', 'remoteload','hideeditor']);
		this.relayEvents(this.weekOnlyView, ['beforeremoteload', 'remoteload','hideeditor']);
		this.relayEvents(this.monthView, ['beforeremoteload', 'remoteload','hideeditor']);
		this.dayView.relayEvents(this, ['canceldetail']);
		this.weekView.relayEvents(this, ['canceldetail']);
		this.weekOnlyView.relayEvents(this, ['canceldetail']);
		this.monthView.relayEvents(this, ['canceldetail']);
		this.on('mousedown', this.onMMouseDownFn, this);
		this.on('showdetailsetting', this.onShowDetailSettingFn, this);
		this.on('refresh', this.refresh, this);
		this.on('destroy', this.onDestroyFn, this);
		this.callParent(arguments);
	},
	onAfterResizeFn : function() {
		this.ehandler.fireEvent('calendarloaded');
	},

	onShowDetailSettingFn : function(obj) {
		this.getLayout().setActiveItem(5);
		this.detailEditor.setup(obj);
	},

	onLanguageSettingFn : function(item) {
		var name = item.name;
		var eh = this.ehandler;
		eh.ds.updateSetting({
					language : name
				}, function() {
					window.location = window.location.href;
				}, this);
	},

	onShowAlertFn : function(item) {
		var eh = this.ehandler;
		var epopup = eh.epopup;
		if (epopup) {
			epopup.hideCB.setValue(false);
		}
		eh.checkExpireEvents();
	},

	onBackFn : function(btn) {
		var cview = this.currentView;
		this.getLayout().setActiveItem(this.currentIdx);
		cview.goBack();
		this.changeLabel(cview);
	},

	onNextFn : function(btn) {
		var cview = this.currentView;
		this.getLayout().setActiveItem(this.currentIdx);
		cview.goNext();
		this.changeLabel(cview);
	},

	onTodayFn : function(btn) {
		this.showDay(new Date());
	},

	onDayFn : function(btn) {
		if (this.currentView != this.dayView) {
			this.showPressed(btn);
			var cview = this.dayView;
			this.getLayout().setActiveItem(0);
			cview.showRange(this.startDate, this.endDate);
			this.changeLabel(cview);
		}
	},

	onWeekFn : function(btn) {
		if (true === btn.weekdayFlag) {
			this.onWeekOnlyFn();
		} else if (this.currentView != this.weekView) {
			this.onWeekAllFn();
		}
	},

	onWeekAllFn : function() {
		if (this.currentView != this.weekView) {
			var cview = this.weekView;
			this.weekBtn.weekdayFlag = false;
			this.showPressed(this.weekBtn);
			this.getLayout().setActiveItem(1);
			cview.showRange(this.startDate, this.endDate, true);
			this.changeLabel(cview);
		}
	},

	onWeekOnlyFn : function() {
		if (this.currentView != this.weekOnlyView) {
			this.weekBtn.weekdayFlag = true;
			this.showPressed(this.weekBtn);
			var cview = this.weekOnlyView;
			this.getLayout().setActiveItem(4);
			cview.showRange(this.startDate, this.endDate, true);
			this.changeLabel(cview);
		}
	},

	onMonthFn : function(btn) {
		if (true == btn.weekdayFlag) {
			this.onMonthOnlyFn();
		} else {
			this.onMonthAllFn();
		}
	},

	onMonthAllFn : function() {
		var cview = this.monthView;
		this.monthBtn.weekdayFlag = false;
		if (this.currentView != this.monthView) {
			this.showPressed(this.monthBtn);
			this.getLayout().setActiveItem(2);
			cview.startColIndex = 0;
			cview.endColIndex = 7;
			cview.colNum = 7;
			cview.showRange(this.startDate, this.endDate);
			this.changeLabel(cview);
		} else {
			cview.startColIndex = 0;
			cview.endColIndex = 7;
			cview.colNum = 7;
			cview.cleanup();
			cview.recalculateSize(cview.body.getWidth(), cview.body.getHeight());
			cview.showCache();
		}
	},

	onMonthOnlyFn : function() {
		var cview = this.monthView;
		this.monthBtn.weekdayFlag = true;
		var offset = (1 == cview.startDay ? 1 : 0);
		if (this.currentView != this.monthView) {
			this.showPressed(this.monthBtn);
			this.getLayout().setActiveItem(2);
			cview.colNum = 5;
			cview.startColIndex = 1 - offset;
			cview.endColIndex = 6 - offset;
			cview.showRange(this.startDate, this.endDate);
			this.changeLabel(cview);
		} else {
			cview.colNum = 5;
			cview.startColIndex = 1 - offset;
			cview.endColIndex = 6 - offset;
			cview.cleanup();
			cview.recalculateSize(cview.body.getWidth(), cview.body.getHeight());
			cview.showCache();
		}
	},

	showPressed : function(btn) {
		this.dayBtn.removeClsWithUI(btn.pressedCls)
		this.weekBtn.removeClsWithUI(btn.pressedCls)
		this.monthBtn.removeClsWithUI(btn.pressedCls)
		btn.addClsWithUI(btn.pressedCls)
		if (btn == this.dayBtn) {
			this.currentIdx = 0;
			this.currentView = this.dayView;
		} else if (btn == this.weekBtn) {
			if (true !== this.weekBtn.weekdayFlag) {
				this.currentIdx = 1;
				this.currentView = this.weekView;
			} else {
				this.currentIdx = 4;
				this.currentView = this.weekOnlyView;
			}
		} else if (btn == this.monthBtn || btn == this.monthOnlyBtn) {
			this.currentIdx = 2;
			this.currentView = this.monthView;
		}
	},

	showDay : function(day) {
		var cview = this.currentView;
		this.getLayout().setActiveItem(this.currentIdx);
		cview.showDay(day);
		this.changeLabel(cview);
	},

	showSingleDay : function(day) {
		var cview = this.dayView;
		cview.daySet[0] = day;
		if (this.currentView != this.dayView) {
			this.showPressed(this.dayBtn);
			this.getLayout().setActiveItem(0);
			cview.resetView();
			cview.fireEvent('checklayout', true);
			this.changeLabel(cview);
		}
	},

	onDayChangeFn : function(cview, day) {
		this.showSingleDay(day);
	},

	onWeekChangeFn : function(sdate, edate) {
		this.showPressed(this.weekBtn);
		var cview = this.currentView;
		this.getLayout().setActiveItem(this.currentIdx);
		cview.showDay(sdate);
		this.changeLabel(cview);
	},

	changeLabel : function(cview) {
		this.startDate = cview.daySet[0];
		this.endDate = cview.daySet[cview.daySet.length - 1];
		this.fireEvent('changedate', this.startDate, this.endDate);
	},

	cancelSearchFn : function() {
		var sf = this.searchField;
		if (sf.hasSearch) {
			sf.setValue('');
			var resultView = this.resultView;
			this.getLayout().setActiveItem(3);
			resultView.list.getStore().removeAll();
			Ext.defer(resultView.loadEvents, 1, resultView, ['']);
			sf.hasSearch = false;
			sf.triggerCell.item(0).setDisplayed(false);
			sf.doComponentLayout();
		}
	},

	onSearchFn : function() {
		var sf = this.searchField, sValue = sf.getValue();
		if (sValue.length < 1) {
			sf.onTrigger1Click();
			return;
		}
		var resultView = this.resultView;
		this.getLayout().setActiveItem(3);
		resultView.list.getStore().removeAll();
		Ext.defer(resultView.loadEvents, 1, resultView, [sValue]);
		sf.hasSearch = true;
		sf.triggerCell.item(0).setDisplayed(true);
		sf.doComponentLayout();
	},

	onSettingFn : function() {
		var eh = this.ehandler;
		if (!eh.settingPop) {
			eh.settingPop =Ext.create('Ext.ux.calendar.popup.SettingPopup',{calendarContainer : this}) ;
		}
		var cs = eh.calendarSetting;
		eh.settingPop.popup(cs);
	},

	onAboutMyCalendarFn : function() {
		var myHtml = '<div style="float:left;width:290px;padding:25px;"><img src="'
				+ Ext.ux.calendar.CONST.MAIN_PATH
				+ 'image/cubedrive.png"/></div>'
				+ '<div style="float:left;width:270px;padding-top:20px;">'
				+ '    <span style="font-size:16px;"><b>CubeDrive MyCalendar</b></span><br/>'
				+ '    <font color="grey">Version '
				+ Ext.ux.calendar.CONST.VERSION
				+ '</font>'
				+ '    <br/><br/>'
				+ '    Copyright &copy; 2007-2012 Ocean Inc. <br>All right reserved<br/>'
				+ '</div>'
				+ '<div style="clear:left;padding: 0 20px 0 20px;">'
				+ '    CubeDrive and CubeDrive logo are the trademarks of the Ocean Inc. All right reserved.<br><br>'
				+ '    To query license information, please vist our site or '
				+ '    send the email to: <a href="mailto:info@cubedrive.com">info@cubedrive.com</a>.'
				+ '    <br>For more detail information, please visit: <a href="http://www.cubedrive.com/myCalendar" target="_blank">http://www.cubedrive.com/myCalendar</a>'
                                + '<br><br>'
                                + '<hr>'
                                + 'CubeDrive provides private cloud solution for organizations of any size looking to retain control of their data while gaining the collaboration, mobility and low cost of the cloud. CubeDrive Private Cloud includes online office, social network and sharing system. Visit <a href="http://www.cubedrive.com">www.cubedrive.com</a> for more detail information.<br><br>'
				+ '</div>';

      var aboutUsWin=Ext.create('Ext.Window',{
					iconCls : 'icon-cubedrive',
					title : 'About CubeDrive MyCalendar',
					width : 600,
					height : 330,
					closable : true,
					resizable : false,
					modal : true,
					html : myHtml
				});
		aboutUsWin.show();
	},

	onCalendarLoadedFn : function() {
		var cview = this.currentView;
		cview.checkLayout(true);
	},

	onRefreshFn : function() {
		this.refresh();
	},

	refresh : function(cflag) {
		var eh = this.ehandler;
		var wp = this.ownerCt.westPanel;
		var ownedCt, sharedCt;
		if (wp.myCalendarPanel) {
			ownedCt = wp.myCalendarPanel.body;
		}
		if (wp.otherCalendarPanel) {
			sharedCt = wp.otherCalendarPanel.body;
		}
		eh.fireEvent('reloadCalendar', ownedCt, sharedCt, cflag);
	},

	onMMouseDownFn : function(e) {
		this.fireEvent('canceldetail');
		this.fireEvent('hideeditor');
	},
	onDestroyFn : function() {
		if (this.monthView.cssId) {
			Ext.util.CSS.removeStyleSheet(this.monthView.cssId);
		}
	}
});
