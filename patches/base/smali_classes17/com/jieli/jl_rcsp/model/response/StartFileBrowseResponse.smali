.class public Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private totalFile:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getTotalFile()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;->totalFile:I

    return v0
.end method

.method public setTotalFile(I)Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;->totalFile:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartFileBrowseResponse{totalFile"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;->totalFile:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
