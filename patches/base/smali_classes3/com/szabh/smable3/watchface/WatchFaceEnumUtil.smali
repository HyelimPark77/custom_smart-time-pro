.class public final Lcom/szabh/smable3/watchface/WatchFaceEnumUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AlignType;,
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;,
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ClickType;,
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;,
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;,
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;,
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageFormatType;,
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;,
        Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$McuPlatform;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil;

    invoke-direct {v0}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil;-><init>()V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil;->INSTANCE:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getColorFormat(I)I
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->LV_COLOR_FORMAT_ARGB8888:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->getValue()B

    move-result p1

    return p1

    :cond_0
    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->LV_COLOR_FORMAT_RGB565:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->getValue()B

    move-result p1

    return p1

    :cond_1
    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->LV_COLOR_FORMAT_RGB888:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->getValue()B

    move-result p1

    return p1

    :cond_2
    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->LV_COLOR_FORMAT_ARGB8565:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->getValue()B

    move-result p1

    return p1

    :cond_3
    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->LV_COLOR_FORMAT_ARGB8888:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ImageType;->getValue()B

    move-result p1

    return p1
.end method

.method public final getDigitFlag(B)B
    .locals 1

    sget-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->POINTER_H:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v0}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v0

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;->TIME_DIGIT_FLAG_HOUR:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;->getValue()B

    move-result p1

    return p1

    :cond_0
    sget-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->POINTER_M:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;

    invoke-virtual {v0}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$ElementType;->getValue()B

    move-result v0

    if-ne p1, v0, :cond_1

    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;->TIME_DIGIT_FLAG_MIN:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;->getValue()B

    move-result p1

    return p1

    :cond_1
    sget-object p1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;->TIME_DIGIT_FLAG_SEC:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;

    invoke-virtual {p1}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DigitFlag;->getValue()B

    move-result p1

    return p1
.end method
