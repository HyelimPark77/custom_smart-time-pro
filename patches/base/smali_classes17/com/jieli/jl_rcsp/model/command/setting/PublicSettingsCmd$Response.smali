.class public Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field private result:I

.field private settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;


# direct methods
.method public constructor <init>(ILcom/jieli/jl_rcsp/model/device/settings/SettingData;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 6
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->result:I

    .line 7
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->result:I

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->parse([B)I

    return-void
.end method


# virtual methods
.method public getResult()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->result:I

    return v0
.end method

.method public getSettingData()Lcom/jieli/jl_rcsp/model/device/settings/SettingData;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    return-object v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_a

    array-length v1, p1

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->result:I

    array-length v1, p1

    const/4 v2, 0x1

    if-le v1, v2, :cond_9

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    if-nez p1, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    new-array v0, v0, [B

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;-><init>([B)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->parse([B)I

    move-result p1

    if-lez p1, :cond_8

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->getVersion()I

    move-result v0

    if-nez v0, :cond_8

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>([B)V

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->getFunction()I

    move-result v1

    if-eq v1, v2, :cond_7

    const/4 v4, 0x2

    if-eq v1, v4, :cond_6

    const/4 v4, 0x3

    if-eq v1, v4, :cond_5

    const/4 v4, 0x4

    if-eq v1, v4, :cond_4

    const/4 v4, 0x5

    if-eq v1, v4, :cond_3

    const/4 v4, 0x7

    if-eq v1, v4, :cond_2

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    goto :goto_0

    :cond_6
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    goto :goto_0

    :cond_7
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/BrightnessSetting;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/BrightnessSetting;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    :cond_8
    :goto_0
    add-int/2addr v2, p1

    :cond_9
    return v2

    :cond_a
    :goto_1
    return v0
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->result:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->result:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", settingData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->settingData:Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
