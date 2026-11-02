.class public Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 2
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 4
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;-><init>([B)V

    .line 5
    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;->toData()[B

    move-result-object v0

    return-object v0
.end method

.method public getSettingData()Lcom/jieli/jl_rcsp/model/device/settings/SettingData;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    return-object v0
.end method

.method public parse([B)I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->parse([B)I

    move-result p1

    return p1
.end method

.method public toData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->toData()[B

    move-result-object v0

    return-object v0
.end method
