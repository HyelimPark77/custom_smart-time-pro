.class public final Lcom/szabh/smable3/watchface/WatchFaceBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BMP_565:I = 0x2

.field public static final ELEMENT_BACKGROUND:I = 0x2

.field public static final ELEMENT_BG_DYNAMIC:I = 0x17

.field public static final ELEMENT_BG_IMAGE_ARRAY:I = 0x2c

.field public static final ELEMENT_DIGITAL_AMPM:I = 0xc

.field public static final ELEMENT_DIGITAL_BAT:I = 0x12

.field public static final ELEMENT_DIGITAL_BT:I = 0x13

.field public static final ELEMENT_DIGITAL_CALORIE:I = 0x10

.field public static final ELEMENT_DIGITAL_DAY:I = 0x8

.field public static final ELEMENT_DIGITAL_DISTANCE:I = 0x11

.field public static final ELEMENT_DIGITAL_DIV_HOUR:I = 0x14

.field public static final ELEMENT_DIGITAL_DIV_MONTH:I = 0x15

.field public static final ELEMENT_DIGITAL_HEART:I = 0xf

.field public static final ELEMENT_DIGITAL_HOUR:I = 0x9

.field public static final ELEMENT_DIGITAL_ICON:I = 0x16

.field public static final ELEMENT_DIGITAL_MIN:I = 0xa

.field public static final ELEMENT_DIGITAL_MONTH:I = 0x7

.field public static final ELEMENT_DIGITAL_SEC:I = 0xb

.field public static final ELEMENT_DIGITAL_STEP:I = 0xe

.field public static final ELEMENT_DIGITAL_WEEKDAY:I = 0xd

.field public static final ELEMENT_DIGITAL_YEAR:I = 0x6

.field public static final ELEMENT_NEEDLE_HOUR:I = 0x3

.field public static final ELEMENT_NEEDLE_MIN:I = 0x4

.field public static final ELEMENT_NEEDLE_SEC:I = 0x5

.field public static final ELEMENT_PREVIEW:I = 0x1

.field public static final GRAVITY_X_CENTER:I = 0x4

.field public static final GRAVITY_X_CENTER_R:I = 0x2

.field public static final GRAVITY_X_LEFT:I = 0x1

.field public static final GRAVITY_X_RIGHT:I = 0x2

.field public static final GRAVITY_X_RIGHT_R:I = 0x4

.field public static final GRAVITY_Y_BOTTOM:I = 0x10

.field public static final GRAVITY_Y_BOTTOM_R:I = 0x20

.field public static final GRAVITY_Y_CENTER:I = 0x20

.field public static final GRAVITY_Y_CENTER_R:I = 0x10

.field public static final GRAVITY_Y_TOP:I = 0x8

.field public static final INSTANCE:Lcom/szabh/smable3/watchface/WatchFaceBuilder;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PNG_ARGB_8888:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceBuilder;

    invoke-direct {v0}, Lcom/szabh/smable3/watchface/WatchFaceBuilder;-><init>()V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceBuilder;->INSTANCE:Lcom/szabh/smable3/watchface/WatchFaceBuilder;

    const-string v1, "smawatchface"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/szabh/smable3/watchface/WatchFaceBuilder;->initLib()V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native build([Lcom/szabh/smable3/watchface/Element;I)[B
    .param p1    # [Lcom/szabh/smable3/watchface/Element;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public final native initLib()V
.end method
