.class public Lcom/jieli/bmp_convert/ConvertParam;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FORMAT_ARGB_8565:I = 0x1

.field public static final FORMAT_ARGB_8888:I = 0x2

.field public static final FORMAT_AUTO:I


# instance fields
.field public a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/bmp_convert/ConvertParam;->a:I

    return-void
.end method


# virtual methods
.method public getFormat()I
    .locals 1

    iget v0, p0, Lcom/jieli/bmp_convert/ConvertParam;->a:I

    return v0
.end method

.method public setFormat(I)Lcom/jieli/bmp_convert/ConvertParam;
    .locals 0

    iput p1, p0, Lcom/jieli/bmp_convert/ConvertParam;->a:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConvertParam{format="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bmp_convert/ConvertParam;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
