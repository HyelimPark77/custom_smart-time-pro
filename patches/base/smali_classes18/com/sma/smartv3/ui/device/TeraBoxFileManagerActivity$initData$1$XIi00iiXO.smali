.class public final Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/jc<",
        "Lcom/sma/smartv3/model/TeraBoxListItem;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Lcom/sma/smartv3/model/TeraBoxListItem;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 2

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCheckedListID$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p3

    const v0, 0x7f080f6f

    if-eqz p3, :cond_0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCheckedListID$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCheckedListID$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/16 v1, 0x14

    if-lt p3, v1, :cond_1

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    const p1, 0x7f141358

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCheckedListID$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const p1, 0x7f080f6e

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->setButtonText()V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Lcom/sma/smartv3/model/TeraBoxListItem;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$XIi00iiXO;->IiI10X(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Lcom/sma/smartv3/model/TeraBoxListItem;Landroid/widget/ImageView;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/TeraBoxListItem;I)V
    .locals 6

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "mTeraBoxListItem"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a05eb

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const v0, 0x7f0a05ea

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0a0570

    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TeraBoxListItem;->getServer_filename()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->Oi()Ljava/text/SimpleDateFormat;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TeraBoxListItem;->getLocal_mtime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TeraBoxListItem;->getSize()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x44800000    # 1024.0f

    div-float/2addr v2, v3

    div-float/2addr v2, v3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v5, v3, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->X1IX(FZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " "

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "MB"

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;

    invoke-static {p3}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCheckedListID$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const p3, 0x7f080f6e

    goto :goto_0

    :cond_0
    const p3, 0x7f080f6f

    :goto_0
    invoke-virtual {v1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/so5;

    invoke-direct {v0, p3, p2, v1}, Lcom/android/mltcode/paycertificationapi/so5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Lcom/sma/smartv3/model/TeraBoxListItem;Landroid/widget/ImageView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/TeraBoxListItem;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$XIi00iiXO;->XOO0ii0(Lcom/sma/smartv3/model/TeraBoxListItem;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0f29

    return v0
.end method

.method public XOO0ii0(Lcom/sma/smartv3/model/TeraBoxListItem;I)Z
    .locals 0

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TeraBoxListItem;->getIsdir()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return p2
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/model/TeraBoxListItem;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$XIi00iiXO;->O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/TeraBoxListItem;I)V

    return-void
.end method
