<%--
  Created by IntelliJ IDEA.
  User: masum
  Date: 6/26/12
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="grails.converters.JSON; com.jabait.hrm.Department"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<g:applyLayout name="app">
    <head>

        <title>${type}</title>
        <style type="text/css">
        .header{
            width: 849px;
        }
        .widget{
            width: 850px;
        }

        </style>
    </head>
    <body>
    %{--<content tag="bannerTag"><h1>${type}</h1></content>--}%

    <content tag="titleTag">

    </content>
    <content tag="rightTag">

    <div class="bread_crumbs_ui_div" style="width: 852px">
        <ul id="crumbs_ui_custom">
            <li><g:link controller="application" action="index">Dashboard</g:link></li>
            %{--<li><g:link controller="configuration" action="payrollConfigHome">Payroll Config Home</g:link></li>--}%
            <li>Payroll Config Home</li>
        </ul>
    </div>

        <br class="clear"/>
        <div class="widget">

            <style>
            .content{height: 125px;}
            .widgetlist { list-style: none; }
            .widgetlist li { display: inline-block; float: left; width: 130px; margin: 0 10px 10px 0; }
            .widgetlist li a { display: block; padding: 15px; border: 1px solid #ccc; color: #333; text-align: center;  }
            .widgetlist li a { -moz-border-radius: 3px; -webkit-border-radius: 3px; border-radius: 3px; -moz-box-shadow: 1px 1px 0 #fff; color: #069; }
            .widgetlist li a span { font-size: 12px; display: block; margin-top: 10px; }
            .widgetlist li a:hover { -moz-box-shadow: 0 0 4px #ddd; background: #fcfcfc; text-decoration: none; }
            </style>

            <div class="header" style="width: 849px;">
                <span><span class="ico gray department"></span>${type}</span>
            </div>

            <div id="list_user" class="content scaffold-list" role="main" style="width: 799px;">
                <ul class="widgetlist">

                    <li style="width: 138px"><g:link controller="configuration" action="allowanceTypeList"><img src="${resource(dir:'images', file: 'cash.png')}" alt="Document Icon"><span>Allowance</span></g:link></li>
                    <li style="width: 138px"><g:link controller="configuration" action="leaveEncashment"><img src="${resource(dir:'images', file: 'encashment.png')}" alt="Leave Encashment"><span>Leave Encashment</span></g:link></li>

                </ul>
            </div>
        </div>
    </content>
    </body>
</g:applyLayout>