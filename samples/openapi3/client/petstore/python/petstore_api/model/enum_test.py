# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class EnumTest(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "enum_string_required",
        }
        
        class properties:
            
            
            class enum_string_required(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "UPPER": "UPPER",
                        "lower": "LOWER",
                        "": "EMPTY",
                    }
                
                @schemas.classproperty
                def UPPER(cls):
                    return cls("UPPER")
                
                @schemas.classproperty
                def LOWER(cls):
                    return cls("lower")
                
                @schemas.classproperty
                def EMPTY(cls):
                    return cls("")
            
            
            class enum_string(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "UPPER": "UPPER",
                        "lower": "LOWER",
                        "": "EMPTY",
                    }
                
                @schemas.classproperty
                def UPPER(cls):
                    return cls("UPPER")
                
                @schemas.classproperty
                def LOWER(cls):
                    return cls("lower")
                
                @schemas.classproperty
                def EMPTY(cls):
                    return cls("")
            
            
            class enum_integer(
                schemas.EnumBase,
                schemas.Int32Schema
            ):
            
            
                class MetaOapg:
                    format = 'int32'
                    enum_value_to_name = {
                        1: "POSITIVE_1",
                        -1: "NEGATIVE_1",
                    }
                
                @schemas.classproperty
                def POSITIVE_1(cls):
                    return cls(1)
                
                @schemas.classproperty
                def NEGATIVE_1(cls):
                    return cls(-1)
            
            
            class enum_number(
                schemas.EnumBase,
                schemas.Float64Schema
            ):
            
            
                class MetaOapg:
                    format = 'double'
                    enum_value_to_name = {
                        1.1: "POSITIVE_1_PT_1",
                        -1.2: "NEGATIVE_1_PT_2",
                    }
                
                @schemas.classproperty
                def POSITIVE_1_PT_1(cls):
                    return cls(1.1)
                
                @schemas.classproperty
                def NEGATIVE_1_PT_2(cls):
                    return cls(-1.2)
        
            @staticmethod
            def stringEnum() -> typing.Type['StringEnum']:
                return StringEnum
        
            @staticmethod
            def IntegerEnum() -> typing.Type['IntegerEnum']:
                return IntegerEnum
        
            @staticmethod
            def StringEnumWithDefaultValue() -> typing.Type['StringEnumWithDefaultValue']:
                return StringEnumWithDefaultValue
        
            @staticmethod
            def IntegerEnumWithDefaultValue() -> typing.Type['IntegerEnumWithDefaultValue']:
                return IntegerEnumWithDefaultValue
        
            @staticmethod
            def IntegerEnumOneValue() -> typing.Type['IntegerEnumOneValue']:
                return IntegerEnumOneValue
            __annotations__ = {
                "enum_string_required": enum_string_required,
                "enum_string": enum_string,
                "enum_integer": enum_integer,
                "enum_number": enum_number,
                "stringEnum": stringEnum,
                "IntegerEnum": IntegerEnum,
                "StringEnumWithDefaultValue": StringEnumWithDefaultValue,
                "IntegerEnumWithDefaultValue": IntegerEnumWithDefaultValue,
                "IntegerEnumOneValue": IntegerEnumOneValue,
            }
    
    enum_string_required: MetaOapg.properties.enum_string_required
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_string_required"]) -> MetaOapg.properties.enum_string_required: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_string"]) -> MetaOapg.properties.enum_string: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_integer"]) -> MetaOapg.properties.enum_integer: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_number"]) -> MetaOapg.properties.enum_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["stringEnum"]) -> 'StringEnum': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["IntegerEnum"]) -> 'IntegerEnum': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["StringEnumWithDefaultValue"]) -> 'StringEnumWithDefaultValue': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["IntegerEnumWithDefaultValue"]) -> 'IntegerEnumWithDefaultValue': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["IntegerEnumOneValue"]) -> 'IntegerEnumOneValue': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["enum_string_required", "enum_string", "enum_integer", "enum_number", "stringEnum", "IntegerEnum", "StringEnumWithDefaultValue", "IntegerEnumWithDefaultValue", "IntegerEnumOneValue", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["enum_string_required"]) -> MetaOapg.properties.enum_string_required: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["enum_string"]) -> typing.Union[MetaOapg.properties.enum_string, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["enum_integer"]) -> typing.Union[MetaOapg.properties.enum_integer, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["enum_number"]) -> typing.Union[MetaOapg.properties.enum_number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["stringEnum"]) -> typing.Union['StringEnum', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["IntegerEnum"]) -> typing.Union['IntegerEnum', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["StringEnumWithDefaultValue"]) -> typing.Union['StringEnumWithDefaultValue', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["IntegerEnumWithDefaultValue"]) -> typing.Union['IntegerEnumWithDefaultValue', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["IntegerEnumOneValue"]) -> typing.Union['IntegerEnumOneValue', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["enum_string_required", "enum_string", "enum_integer", "enum_number", "stringEnum", "IntegerEnum", "StringEnumWithDefaultValue", "IntegerEnumWithDefaultValue", "IntegerEnumOneValue", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        enum_string_required: typing.Union[MetaOapg.properties.enum_string_required, str, ],
        enum_string: typing.Union[MetaOapg.properties.enum_string, str, schemas.Unset] = schemas.unset,
        enum_integer: typing.Union[MetaOapg.properties.enum_integer, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        enum_number: typing.Union[MetaOapg.properties.enum_number, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        stringEnum: typing.Union['StringEnum', schemas.Unset] = schemas.unset,
        IntegerEnum: typing.Union['IntegerEnum', schemas.Unset] = schemas.unset,
        StringEnumWithDefaultValue: typing.Union['StringEnumWithDefaultValue', schemas.Unset] = schemas.unset,
        IntegerEnumWithDefaultValue: typing.Union['IntegerEnumWithDefaultValue', schemas.Unset] = schemas.unset,
        IntegerEnumOneValue: typing.Union['IntegerEnumOneValue', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'EnumTest':
        return super().__new__(
            cls,
            *_args,
            enum_string_required=enum_string_required,
            enum_string=enum_string,
            enum_integer=enum_integer,
            enum_number=enum_number,
            stringEnum=stringEnum,
            IntegerEnum=IntegerEnum,
            StringEnumWithDefaultValue=StringEnumWithDefaultValue,
            IntegerEnumWithDefaultValue=IntegerEnumWithDefaultValue,
            IntegerEnumOneValue=IntegerEnumOneValue,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.model.integer_enum import IntegerEnum
from petstore_api.model.integer_enum_one_value import IntegerEnumOneValue
from petstore_api.model.integer_enum_with_default_value import IntegerEnumWithDefaultValue
from petstore_api.model.string_enum import StringEnum
from petstore_api.model.string_enum_with_default_value import StringEnumWithDefaultValue
