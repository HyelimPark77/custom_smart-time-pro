.class public final Lcom/szabh/smable3/component/BleParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/OIXOI;


# static fields
.field public static final INSTANCE:Lcom/szabh/smable3/component/BleParser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final LOG_HEADER:Ljava/lang/String; = "BleParser"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mData:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mReceived:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/BleParser;

    invoke-direct {v0}, Lcom/szabh/smable3/component/BleParser;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/BleParser;->INSTANCE:Lcom/szabh/smable3/component/BleParser;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/szabh/smable3/component/BleParser;->mData:[B

    const/4 v0, -0x1

    sput v0, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive([B)[B
    .locals 10
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    sget v0, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    aget-byte v0, p1, v3

    const/16 v4, -0x55

    if-eq v0, v4, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BleParser -> First packet data error : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/bestmafen/baseble/data/ByteArrayExtKt;->getMHexString([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    return-object v1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lcom/bestmafen/baseble/data/ByteArrayExtKt;->getInt$default([BIILjava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result p1

    add-int/lit8 p1, p1, 0x6

    new-array p1, p1, [B

    sput-object p1, Lcom/szabh/smable3/component/BleParser;->mData:[B

    sput v3, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    goto :goto_0

    :cond_1
    move-object v4, p1

    :goto_0
    sget p1, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    sget-object v0, Lcom/szabh/smable3/component/BleParser;->mData:[B

    array-length v5, v0

    if-ge p1, v5, :cond_2

    array-length v5, v4

    invoke-static {v4, v3, v0, p1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sget p1, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    array-length v0, v4

    add-int/2addr p1, v0

    sput p1, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BleParser -> data length="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lcom/szabh/smable3/component/BleParser;->mData:[B

    array-length v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", received="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v3, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    sget p1, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    sget-object v0, Lcom/szabh/smable3/component/BleParser;->mData:[B

    array-length v3, v0

    if-lt p1, v3, :cond_2

    sput v2, Lcom/szabh/smable3/component/BleParser;->mReceived:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-virtual {p0}, Lcom/szabh/smable3/component/BleParser;->reset()V

    :cond_2
    return-object v1
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/szabh/smable3/component/BleParser;->mData:[B

    const/4 v0, -0x1

    sput v0, Lcom/szabh/smable3/component/BleParser;->mReceived:I

    return-void
.end method
