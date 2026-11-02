.class public Lcom/jieli/jl_rcsp/model/HealthDataQuery;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mask:I

.field private final param:[B

.field private final version:I


# direct methods
.method public constructor <init>(II[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->version:I

    iput p2, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->mask:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->param:[B

    return-void
.end method


# virtual methods
.method public getMask()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->mask:I

    return v0
.end method

.method public getParam()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->param:[B

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->version:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthDataQuery{version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->version:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->mask:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", param="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/HealthDataQuery;->param:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
