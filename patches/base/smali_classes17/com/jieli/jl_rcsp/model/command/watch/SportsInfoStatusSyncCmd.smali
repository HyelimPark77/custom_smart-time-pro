.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$SetReadRealDataIntervalParam;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataParam;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ResumeSportsParam;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$PauseSportsParam;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsParam;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;,
        Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoParam;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandBase<",
        "Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;",
        ">;"
    }
.end annotation


# static fields
.field public static final OP_APP_STOP_SPORTS:B = 0x2t

.field public static final OP_FIRMWARE_STOP_SPORTS:B = 0x3t

.field public static final OP_PAUSE_SPORTS:B = 0x4t

.field public static final OP_READ_REAL_DATA:B = 0x6t

.field public static final OP_READ_SPORTS_INFO:B = 0x0t

.field public static final OP_RESUME_SPORTS:B = 0x5t

.field public static final OP_SET_REAL_DATA_READ_INTERVAL:B = 0x7t

.field public static final OP_START_SPORTS:B = 0x1t

.field public static final SPORTS_STATUS_RUNNING:B = 0x1t

.field public static final SPORTS_STATUS_STOP:B = 0x0t

.field public static final SPORTS_TYPE_INDOOR:B = 0x2t

.field public static final SPORTS_TYPE_OUTDOOR:B = 0x1t


# direct methods
.method public constructor <init>(ILcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)V
    .locals 2

    .line 2
    const-class v0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa6

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;-><init>(ILjava/lang/String;I)V

    .line 3
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)V

    return-void
.end method

.method public static synthetic access$000(F)F
    .locals 0

    invoke-static {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;->getFormatValue(F)F

    move-result p0

    return p0
.end method

.method private static getFormatValue(F)F
    .locals 2

    :try_start_0
    const-string v0, "%.2f"

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return p0
.end method
