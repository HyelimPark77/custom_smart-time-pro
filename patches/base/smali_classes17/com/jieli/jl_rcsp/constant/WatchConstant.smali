.class public Lcom/jieli/jl_rcsp/constant/WatchConstant;
.super Lcom/jieli/jl_rcsp/constant/RcspConstant;
.source "SourceFile"


# static fields
.field public static final DEFAULT_DIAL_BACKGROUND_NAME:Ljava/lang/String; = "/null"

.field public static final DEVICE_PHONE_STATUS_CALLING:I = 0x1

.field public static final DEVICE_PHONE_STATUS_NORMAL:I = 0x0

.field public static final ENABLE_ERASURE_DATA_CMD:Z = false

.field public static ENABLE_WRITE_DATA_CHECK:Z = false

.field public static final FAT_END_OFFSET:I = 0x4000

.field public static final FAT_FS_ROOT:Ljava/lang/String; = "/"

.field public static final FAT_HEAD_OFFSET:I = 0x2000

.field public static final RES_DIR_NAME:Ljava/lang/String; = "res.ori"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/constant/RcspConstant;-><init>()V

    return-void
.end method

.method public static getLibVersionCode()I
    .locals 1

    const/16 v0, 0x2bce

    return v0
.end method

.method public static getLibVersionName()Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "1.13.1"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const-string v0, "0.0.0"

    return-object v0
.end method
