.class public Lcom/jieli/jl_rcsp/util/CryptoUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "jl_crc"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static CRC16([BS)S
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->crc16([BS)S

    move-result p0

    return p0
.end method

.method private static native crc16([BS)S
.end method
