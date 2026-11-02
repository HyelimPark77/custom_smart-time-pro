.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;
.super Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;
.source "SourceFile"


# instance fields
.field public networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;


# direct methods
.method public constructor <init>(ILcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 2
    new-array v1, v0, [B

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->toData()[B

    move-result-object v1

    :goto_0
    const/4 v2, 0x5

    invoke-direct {p0, v2, v0, p1, v1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(III[B)V

    .line 3
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(Landroid/os/Parcel;)V

    .line 5
    const-class v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>([B)V

    return-void
.end method


# virtual methods
.method public getNetworkBase()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    return-object v0
.end method

.method public parse([B)I
    .locals 3

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->getPayload()[B

    move-result-object v0

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->getOp()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    new-instance v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;-><init>([B)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    return p1

    :cond_2
    new-instance v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>([B)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->getType()I

    move-result v1

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_3

    :goto_0
    return p1

    :cond_3
    new-instance v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;-><init>([B)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    return p1

    :cond_4
    new-instance v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;-><init>([B)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NetworkFunction{networkBase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->networkBase:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
