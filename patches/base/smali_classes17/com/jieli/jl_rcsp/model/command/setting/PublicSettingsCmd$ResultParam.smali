.class public Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$ResultParam;
.super Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ResultParam"
.end annotation


# instance fields
.field private result:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$ResultParam;->result:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 3
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;-><init>([B)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    .line 4
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$ResultParam;->result:I

    return-void
.end method


# virtual methods
.method public getResult()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$ResultParam;->result:I

    return v0
.end method

.method public parse([B)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    aget-byte v0, p1, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$ResultParam;->result:I

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;->parse([B)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 3

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$ResultParam;->result:I

    int-to-byte v0, v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method
