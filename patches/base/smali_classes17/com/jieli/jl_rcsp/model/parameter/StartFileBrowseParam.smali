.class public Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private pathData:Lcom/jieli/jl_filebrowse/bean/PathData;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_filebrowse/bean/PathData;)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;->pathData:Lcom/jieli/jl_filebrowse/bean/PathData;

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;->pathData:Lcom/jieli/jl_filebrowse/bean/PathData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/PathData;->toData()[B

    move-result-object v0

    return-object v0
.end method

.method public getPathData()Lcom/jieli/jl_filebrowse/bean/PathData;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;->pathData:Lcom/jieli/jl_filebrowse/bean/PathData;

    return-object v0
.end method

.method public setPathData(Lcom/jieli/jl_filebrowse/bean/PathData;)Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;->pathData:Lcom/jieli/jl_filebrowse/bean/PathData;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartFileBrowseParam{pathData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;->pathData:Lcom/jieli/jl_filebrowse/bean/PathData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
