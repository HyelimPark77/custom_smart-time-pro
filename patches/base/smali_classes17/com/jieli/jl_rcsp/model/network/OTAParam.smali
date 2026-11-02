.class public Lcom/jieli/jl_rcsp/model/network/OTAParam;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private otaData:[B

.field private otaFilePath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/model/network/OTAParam;-><init>(Ljava/lang/String;[B)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/network/OTAParam;->otaFilePath:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/network/OTAParam;->otaData:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/network/OTAParam;-><init>(Ljava/lang/String;[B)V

    return-void
.end method


# virtual methods
.method public getOtaData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/network/OTAParam;->otaData:[B

    return-object v0
.end method

.method public getOtaFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/network/OTAParam;->otaFilePath:Ljava/lang/String;

    return-object v0
.end method

.method public setOtaData([B)Lcom/jieli/jl_rcsp/model/network/OTAParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/network/OTAParam;->otaData:[B

    return-object p0
.end method

.method public setOtaFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/network/OTAParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/network/OTAParam;->otaFilePath:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OTAParam{otaFilePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/network/OTAParam;->otaFilePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", otaData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/network/OTAParam;->otaData:[B

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    array-length v1, v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
