.class public final Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$OXO1;
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Lcom/sma/smartv3/model/TeraBoxListItem;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TeraBoxListItem;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$setMCurDir$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMMapTitle$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/HashMap;

    move-result-object p2

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCurDir$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TeraBoxListItem;->getServer_filename()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMTitle(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TeraBoxListItem;->getServer_filename()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMMapData$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/HashMap;

    move-result-object p1

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCurDir$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMKeyIndex$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCurDir$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMKeyIndex$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCurDir$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMMapData$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/util/HashMap;

    move-result-object p1

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$getMCurDir$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->initData(Ljava/util/List;)V

    return-void

    :cond_1
    const/4 p1, 0x1

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->access$setPage$p(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;->getTeraBoxList()V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Lcom/sma/smartv3/model/TeraBoxListItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$OXO1;->IiI10X(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Lcom/sma/smartv3/model/TeraBoxListItem;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/TeraBoxListItem;I)V
    .locals 3

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

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TeraBoxListItem;->getServer_filename()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->Oi()Ljava/text/SimpleDateFormat;

    move-result-object p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TeraBoxListItem;->getLocal_mtime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ro5;

    invoke-direct {v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/ro5;-><init>(Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity;Lcom/sma/smartv3/model/TeraBoxListItem;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/TeraBoxListItem;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$OXO1;->XOO0ii0(Lcom/sma/smartv3/model/TeraBoxListItem;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0f28

    return v0
.end method

.method public XOO0ii0(Lcom/sma/smartv3/model/TeraBoxListItem;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TeraBoxListItem;->getIsdir()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return p2
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/model/TeraBoxListItem;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/TeraBoxFileManagerActivity$initData$1$OXO1;->O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/TeraBoxListItem;I)V

    return-void
.end method
