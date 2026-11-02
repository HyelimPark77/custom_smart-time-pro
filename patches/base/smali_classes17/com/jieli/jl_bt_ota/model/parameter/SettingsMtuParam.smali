.class public Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;
.super Lcom/jieli/jl_bt_ota/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private mtu:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;->mtu:I

    return-void
.end method


# virtual methods
.method public getMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;->mtu:I

    return v0
.end method

.method public getParamData()[B
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;->mtu:I

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->int2byte2(I)[B

    move-result-object v0

    return-object v0
.end method

.method public setMtu(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;->mtu:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SettingsMtuParam{mtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;->mtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
