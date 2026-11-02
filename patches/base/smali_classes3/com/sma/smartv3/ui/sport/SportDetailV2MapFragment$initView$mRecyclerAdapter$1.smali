.class public final Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$initView$mRecyclerAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$XIi00iiXO;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$XIi00iiXO;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0d0f1e

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$XIi00iiXO;I)V
    .locals 1

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$XIi00iiXO;->XOO0ii0()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a05e5

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const p3, 0x7f0a05e4

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$XIi00iiXO;->IiI10X()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const p3, 0x7f0a05e6

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$XIi00iiXO;->I0IIOi()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$XIi00iiXO;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$initView$mRecyclerAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/sport/SportDetailV2MapFragment$XIi00iiXO;I)V

    return-void
.end method
