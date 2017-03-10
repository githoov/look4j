grammar LookML;

@header {
    package com.githoov.look4j;
}

 lookml
    : (view | comment)* EOF
    ;

 view
    : VIEW SEP STRING LBRACE (sql_table_name | derived_table)? (field)* RBRACE
    ;

 sql_table_name
    : SQL_TABLE_NAME SEP statement DELIM
    ;

 derived_table
    : DERIVED_TABLE SEP LBRACE (derived_table_pair)* RBRACE
    ;

 derived_table_pair
    : SQL SEP statement DELIM
    | array_key SEP array
    | SQL_TRIGGER_VALUE SEP statement DELIM
    ;

 field
    : FIELD SEP STRING LBRACE (pair)* RBRACE
    | LBRACE RBRACE
    | SQL SEP TABLE_REF DELIM
    | SQL SEP statement DELIM
    ;

 pair
    : key SEP STRING? LBRACE (pair)* RBRACE
    | array_key SEP array
    | key SEP value DELIM?
    ;

 array_key
    : DRILL_FIELDS
    | SORTKEYS
    ;

 array
    : STRING*
    | QUOTED_STRING*
    ;

 key
   : SQL
   | LABEL
   | TYPE
   | LINK
   | URL
   | DESCRIPTION
   | VIEW_LABEL
   ;

 value
   : TABLE_REF
   | QUOTED_STRING
   | STRING
   ;

 statement
    : STRING+
    ;

 comment
    : COMMENT
    ;

 VIEW
    : 'view'
    ;

 SQL_TABLE_NAME
    : 'sql_table_name'
    ;

 FIELD
    : 'dimension'
    | 'dimension_group'
    | 'measure'
    | 'filter'
    ;

 SQL
    : 'sql'
    ;

 LABEL
    : 'label'
    ;

 VIEW_LABEL
    : 'view_label'
    ;

 TYPE
    : 'type'
    ;

 LINK
    : 'link'
    ;

 URL
    : 'url'
    ;

 DESCRIPTION
    : 'description'
    ;

 DRILL_FIELDS
    : 'drill_fields'
    ;

 DERIVED_TABLE
    : 'derived_table'
    ;

 SQL_TRIGGER_VALUE
    : 'sql_trigger_value'
    ;

 SORTKEYS
    : 'sortkeys'
    ;

 STRING
    : ('a'..'z' | 'A'..'Z' | '_' | '-' | '*' | '(' | ')' | '/' | '.' | '[' | ']' | '\'' | '"' | ',' | '=' | '>' | '<')+
    ;

 QUOTED_STRING
    : '\"' ( ~('\n'|'\r') )*? '\"'
    ;

 TABLE_REF
    : '${TABLE}.' [A-Za-z\\._:"]+
    ;

 WS
    : [ \t\r\n]+ -> skip
    ;

 COMMENT
    : '#' ~('\r'|'\n')* -> channel(HIDDEN)
    ;

 DELIM
    : ';;'
    ;

 SEP
    : ':'
    ;

 LBRACE
    : '{'
    ;

 RBRACE
    : '}'
    ;