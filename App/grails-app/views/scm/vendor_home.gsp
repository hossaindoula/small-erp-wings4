<%--
  Created by IntelliJ IDEA.
  User: hossaindoula
  Date: 2/19/12
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
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

        <div>
            <div class="bread_crumbs_ui_div" style="width: 851px">
                <ul id="crumbs_ui_custom">
                    <li><g:link controller="application" action="index">Dashboard</g:link></li>
                    <li><g:link controller="scm" action="home">Supply-Chain Management</g:link></li>
                    <li>${type}</li>
                </ul>
            </div>
        </div>
        <br class="clear"/>
        <div class="widget">
            <style>
            .content{height: 125px;}
            .widgetlist { list-style: none; }
            .widgetlist li { display: inline-block; float: left; width: 130px; margin: 0 10px 10px 0; }
            .widgetlist li a { display: block; padding: 15px; border: 1px solid #ccc; color: #333; text-align: center; background: #f7f7f7; }
            .widgetlist li a { -moz-border-radius: 3px; -webkit-border-radius: 3px; border-radius: 3px; -moz-box-shadow: 1px 1px 0 #fff; color: #069; }
            .widgetlist li a span { font-size: 12px; display: block; margin-top: 10px; }
            .widgetlist li a:hover { -moz-box-shadow: 0 0 4px #ddd; background: #fcfcfc; text-decoration: none; }
            </style>
            <div class="header" style="width: 849px;">
                <span><span class="ico gray scm"></span>${type}</span>
            </div>
            <g:if test="${flash.message}">
                <div class="container_12">
                    <div class="grid_4">
                    </div>
                    <div class="grid_4 message" role="status">
                        <g:message code="${flash.message}" args="${flash.args}" default="${flash.default}"></g:message>
                    </div>
                    <div class="clear"></div>
                </div>
            </g:if>
            <div id="list_user" class="content scaffold-list" role="main" style="width: 800px;">
                <ul class="widgetlist">
                    <li><g:link controller="vendor" action="localVendorList"><img src="${resource(dir:'images/assets/icons', file: 'local_supplier.png')}" alt="Document Icon"><span>Local Vendor</span></g:link></li>
                    <li><g:link controller="vendor" action="externalVendorList"><img src="${resource(dir:'images/assets/icons', file: 'external_supplier.png')}" alt="Document Icon"><span>External Vendor</span></g:link></li>
                </ul>
            </div>
        </div>
    </content>
    </body>
</g:applyLayout>