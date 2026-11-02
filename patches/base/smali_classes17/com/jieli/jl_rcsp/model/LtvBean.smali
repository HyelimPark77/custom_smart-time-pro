.class public Lcom/jieli/jl_rcsp/model/LtvBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final data:[B

.field private final len:I

.field private final type:I


# direct methods
.method public constructor <init>(II[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->len:I

    iput p2, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->type:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->data:[B

    return-void
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->data:[B

    return-object v0
.end method

.method public getLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->len:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->type:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LtvBean{len="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->len:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/LtvBean;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
