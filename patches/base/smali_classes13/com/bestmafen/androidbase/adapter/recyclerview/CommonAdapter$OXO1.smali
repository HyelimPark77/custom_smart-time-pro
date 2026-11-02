.class public Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/jc<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:I

.field public final synthetic XIi00iiXO:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;


# direct methods
.method public constructor <init>(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter$OXO1;->XIi00iiXO:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    iput p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter$OXO1;->OXO1:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/Object;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter$OXO1;->OXO1:I

    return v0
.end method

.method public iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;",
            "TT;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter$OXO1;->XIi00iiXO:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-virtual {v0, p1, p2, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V

    return-void
.end method
