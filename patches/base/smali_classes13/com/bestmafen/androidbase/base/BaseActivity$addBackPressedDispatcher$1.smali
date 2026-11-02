.class public final Lcom/bestmafen/androidbase/base/BaseActivity$addBackPressedDispatcher$1;
.super Landroidx/activity/OnBackPressedCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/androidbase/base/BaseActivity;->addBackPressedDispatcher()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/bestmafen/androidbase/base/BaseActivity;


# direct methods
.method public constructor <init>(Lcom/bestmafen/androidbase/base/BaseActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/bestmafen/androidbase/base/BaseActivity$addBackPressedDispatcher$1;->this$0:Lcom/bestmafen/androidbase/base/BaseActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/activity/OnBackPressedCallback;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/base/BaseActivity$addBackPressedDispatcher$1;->this$0:Lcom/bestmafen/androidbase/base/BaseActivity;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method
