.class public Lcom/jieli/jl_rcsp/exception/ParseDataException;
.super Lcom/jieli/jl_rcsp/exception/BaseException;
.source "SourceFile"


# static fields
.field public static final REASON_INSUFFICIENT_DATA:I = 0x1

.field public static final REASON_TYPE_NOT_MATCH:I = 0x2


# instance fields
.field private data:[B

.field private final reason:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    new-array v0, v0, [B

    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;[B)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;[B)V
    .locals 0

    .line 2
    invoke-direct {p0, p2}, Lcom/jieli/jl_rcsp/exception/BaseException;-><init>(Ljava/lang/String;)V

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/exception/ParseDataException;->reason:I

    .line 4
    iput-object p3, p0, Lcom/jieli/jl_rcsp/exception/ParseDataException;->data:[B

    return-void
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/exception/ParseDataException;->data:[B

    return-object v0
.end method

.method public getErrorCode()I
    .locals 1

    const/16 v0, 0x3001

    return v0
.end method

.method public getReason()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/exception/ParseDataException;->reason:I

    return v0
.end method

.method public setData([B)Lcom/jieli/jl_rcsp/exception/ParseDataException;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/exception/ParseDataException;->data:[B

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ParseException{data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/exception/ParseDataException;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/exception/ParseDataException;->reason:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
